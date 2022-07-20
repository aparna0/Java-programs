/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundrecording;
import com.sun.prism.impl.Disposer.Record;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.text.Font;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
public class SoundRecording {

    /**
     * @param args the command line arguments
     */
     InputStream in;
    AudioStream audio ;
    java.awt.Font f=new java.awt.Font("serif",java.awt.Font.ITALIC,24);
AudioFormat audioFormat;
 JFrame fr;
  TargetDataLine targetDataLine;
  final JButton captureBtn =new JButton("Capture");
  final JButton stopBtn = new JButton("Stop");
  final JButton playBtn=new JButton("Records");  
 
  File audioFile;
  JTextField tx;
  public SoundRecording()
  {   fr=new JFrame();
  fr.setSize(300,250);
  fr.setLayout(null);
    captureBtn.setEnabled(true);
    stopBtn.setEnabled(false);
    playBtn.setEnabled(true);
    captureBtn.setBounds(30,80,100,30);
    stopBtn.setBounds(150,80,100,30);
     playBtn.setBounds(90,130,100,30);
    fr.add(captureBtn);
    fr.add(stopBtn);
    fr.add(playBtn);
    fr.setVisible(true);
    captureBtn.addActionListener(new ActionListener()
    {
       public void actionPerformed(ActionEvent e)
       {
          stopBtn.setEnabled(true);
          captureBtn.setEnabled(false);
         captureAudio();
       }
    });
    stopBtn.addActionListener(new ActionListener()
    {
       public void actionPerformed(ActionEvent e)
       {
          captureBtn.setEnabled(true);
          stopBtn.setEnabled(false);
          targetDataLine.stop();
          targetDataLine.close();
           Dialog d=new Dialog(fr,false);
            d.setSize(300,250);
            d.setLayout(null);
          tx=new JTextField();
         JLabel l=new JLabel("Rename Recording");
            l.setBounds(50,50,200,30);
            d.add(l);
            tx=new JTextField();
            tx.setBounds(50,100,200,30);
            d.add(tx);
            JButton b1=new JButton("apply");
            b1.setBounds(30,180,100,30);
             JButton b2=new JButton("cancle");
             b2.setBounds(180,180,100,30);
             d.add(b1);
             d.add(b2);
            d.setVisible(true);
            b1.addActionListener(new ActionListener()//renaming
             { 
                 public void actionPerformed(ActionEvent e)
                 { 
                     String name=tx.getText();
                 String path="F:/java_programs/diploma/SoundRecording/RecordedSounds/"+name+".wav";
                 System.out.println(path);
                 File file=new File(path);
                if(audioFile.renameTo(file))
                {
                    
                }
                d.setVisible(false);
                 }
             });
               b2.addActionListener(new ActionListener()
             {
                 public void actionPerformed(ActionEvent e)
                 {  
                     d.setVisible(false);
                 }
             });
       }
    });
    playBtn.addActionListener(new ActionListener()
    {
       public void actionPerformed(ActionEvent e)
       {
       FileDialog fd=new FileDialog(fr,"select file",FileDialog.LOAD);
              
              fd.setSize(400,400);
              fd.setVisible(true);
              
             String str1=fd.getFile();
             String str2=fd.getDirectory();
           String filepath=str2+str1;
             if(str1==null)
             {
             }
             else
             { 
                 try {
                     in=new FileInputStream(new File(filepath));
                        
    audio=new AudioStream(in);
    AudioPlayer.player.start(audio);
                 } catch (FileNotFoundException ex) {
                     Logger.getLogger(Record.class.getName()).log(Level.SEVERE, null, ex);
                 } catch (IOException ex) {
                     Logger.getLogger(Record.class.getName()).log(Level.SEVERE, null, ex);
                 }
               Dialog pd=new Dialog(fr);
               pd.setSize(200,150);
               JButton b=new JButton("Stop");
               b.setBounds(50,50,100,30);
               pd.setLayout(null);
               pd.add(b);
               pd.setVisible(true);
               b.addActionListener(new ActionListener()
               {
                   public void actionPerformed(ActionEvent e)
                   {
                       pd.setVisible(false);
                  AudioPlayer.player.stop(audio);     
                   }
               });
             } 
       }
    });
  }
    public static void main(String[] args) {
        // TODO code application logic here
        new SoundRecording();
    }
    private void captureAudio(){
    try{
     
      audioFormat = getAudioFormat();
      DataLine.Info dataLineInfo =
                          new DataLine.Info(
                            TargetDataLine.class,
                            audioFormat);
      targetDataLine = (TargetDataLine)
               AudioSystem.getLine(dataLineInfo);
      new CaptureThread().start();
      Graphics g=fr.getGraphics();
      g.drawString("Recording...",10,30);
      
    }catch (Exception e) {
      e.printStackTrace();
      System.exit(0);
    }//end catch
  }//end captureAudio method
      private AudioFormat getAudioFormat(){
    float sampleRate = 8000.0F;
    //8000,11025,16000,22050,44100
    int sampleSizeInBits = 16;
    //8,16
    int channels = 1;
    //1,2
    boolean signed = true;
    //true,false
    boolean bigEndian = false;
    //true,false
    return new AudioFormat(sampleRate,
                           sampleSizeInBits,
                           channels,
                           signed,
                           bigEndian);
  }//end getAudioFormat
      public class CaptureThread extends Thread
      {
          public void run()
          {
              AudioFileFormat.Type fileType = AudioFileFormat.Type.WAVE;
               String name=new Date().getTime()+".wav";
                 String  filepath="F:/java_programs/diploma/SoundRecording/RecordedSounds/"+name;
                   System.out.println(filepath);
    audioFile =new File(filepath);
 try{
      targetDataLine.open(audioFormat);
      targetDataLine.start();
      AudioSystem.write(
            new AudioInputStream(targetDataLine),
            fileType,
            audioFile);
    }catch (Exception e){
      e.printStackTrace();
    }//end catch
          }//end of run
      }//end of capture
}
