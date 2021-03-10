package Utility;

import java.io.IOException;

public class Square {
        int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int area() throws IOException {

        if(sideLength>0){
            return sideLength*sideLength;
        }else if(sideLength<0){
            throw new IOException("Side cannot be negative");
        }else{
            throw new IOException("Side cannot be Zero");
        }
    }

    public int perimeter() throws IOException{
        if(sideLength>0){
            return sideLength*4;
        }else if(sideLength<0){
            throw new IOException("Side cannot be negative");
        }else{
            throw new IOException("Side cannot be zero");
        }
    }
}
