/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruby;

import java.util.Scanner;

/**
 *
 * @author Luong Huy Thong
 */
public class Video extends Thing {
    private String serial;
    private String nameVideo;
    private int yearRelease;
    private String category;

    public Video() {
    }

    public Video(String serial, String nameVideo, int yearRelease, String category) {
        this.serial = serial;
        this.nameVideo = nameVideo;
        this.yearRelease = yearRelease;
        this.category = category;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getNameVideo() {
        return nameVideo;
    }

    public void setNameVideo(String nameVideo) {
        this.nameVideo = nameVideo;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

   
    void inputVideo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter New Video!");
        System.out.println("-----------------");
        System.out.println("Enter Name Video: ");
        nameVideo = sc.nextLine();
        System.out.println("Enter Year Release: ");
        yearRelease = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Category: ");
        category = sc.nextLine();
    }

    @Override
    String getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
