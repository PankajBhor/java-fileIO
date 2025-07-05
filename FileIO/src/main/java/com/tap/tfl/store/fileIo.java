package com.tap.tfl.store;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.tap.tfl.Entity.question;
public class fileIo {
    public void writeFile(question q) {
        try {
            FileOutputStream fout =  new FileOutputStream("D:\\java-fileIO\\FileIO\\src\\main\\java\\com\\tap\\tfl\\store\\input.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(q);
            oos.close();
            fout.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public question readFile() throws ClassNotFoundException{
        question q =new question();
         try { 
            FileInputStream fin=  new FileInputStream("D:\\java-fileIO\\FileIO\\src\\main\\java\\com\\tap\\tfl\\store\\input.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            q = (question) ois.readObject();
            ois.close();
            fin.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    return q;
    }
}
