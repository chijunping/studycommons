package com.cjp.sdutycommons.NIO;
  
import java.nio.channels.SelectionKey;  
  
public interface NioHandler {  
    void execute(SelectionKey key);  
}  