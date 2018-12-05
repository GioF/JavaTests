/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.io.*;

/**
 *
 * @author Truxton
 */
public class editor {
    
    String Data;
    String rpath = "";
    String rname = "";
    String wpath = "";
    String wname = "";
    int fsize;
    FileReader in = null;
    FileWriter out = null;
    
    public editor(String path){
    }
    
    public void setRpath(String rpath){
        this.rpath = rpath;
    }
    public void setWpath(String rpath){
        this.wpath = rpath;
    }
    
    public void setFileName(String name){
        this.rname = name;
    }
    
    public String read() throws IOException{
        String databuffer = "";
        this.in = new FileReader(this.rpath + "\\" + this.rname);
        int c;
        while( (c = this.in.read()) != -1){
            databuffer += (char)c;
        }
        this.Data = databuffer;
        return databuffer;
    }
    
    
    public void write() throws IOException{
        this.out = new FileWriter(this.wpath + "\\" + this.wname);
        
    }
    
    
}
