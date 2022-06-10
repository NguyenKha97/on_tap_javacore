/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn_buoi1_20522197_java;

/**
 *
 * @author admin
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.LocalTime;
public class DateAndTime {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nagy hien tai chua format:");
        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println(LocalDate.now());
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Ngay sau khi format dd-mm-yyyy:");
        System.out.println(date.format(formatDate));
        
        System.out.println("Thoi gian chua format:");
        LocalTime time = LocalTime.now();
        System.out.println(time);
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Thoi gian sau khi format:");
        System.out.println(time.format(formatTime));
        
        System.out.println("Ngay va gio chua format:");
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        DateTimeFormatter formatDayTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Ngay va gio sau khi format:");
        System.out.println(dateTime.format(formatDayTime));
        

        
    }
    
}
