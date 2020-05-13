package com.ibm.curamspm.rtc.plain.task;
import com.ibm.curamspm.rtc.plain.common.RTCTask;
import java.util.*;

public class HelloWorld extends RTCTask{

	// variables
    private String projectAreaName = "L2 Support";

    @Override
    //public static void main(String args[]) {
     public void mainMethod(){

        System.out.println("Hello World!");
    }


}
