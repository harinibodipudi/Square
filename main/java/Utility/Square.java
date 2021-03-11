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
        }else{
            throw new IOException("Rectangle sides do not support negative and Zero Values");
        }
    }

    public int perimeter() throws IOException{
        if(sideLength>0){
            return sideLength*4;
        }else{
            throw new IOException("Rectangle sides do not support negative and Zero Values");
        }
    }
}
