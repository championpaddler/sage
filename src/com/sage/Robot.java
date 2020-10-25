package com.sage;


public	class Robot {
 int x;
 int y;
 char pointer;
 Robot(int a, int b, char initialPointer) {
     this.x = a;
     this.y = b;
     this.pointer = initialPointer;
 }

 public void turnLeft() {
     switch (this.pointer) {
         case 'N':
             this.pointer = 'W';
             break;
         case 'W':
             this.pointer = 'S';
             break;
         case 'S':
             this.pointer = 'E';
             break;
         case 'E':
             this.pointer = 'N';
             break;
     }

 }

 public void turnRight() {
     switch (this.pointer) {
         case 'N':
             this.pointer = 'E';
             break;
         case 'W':
             this.pointer = 'N';
             break;
         case 'S':
             this.pointer = 'W';
             break;
         case 'E':
             this.pointer = 'S';
             break;
     }
 }

 public void move() {
     switch (this.pointer) {
         case 'N':
             this.y=this.y+1;
             break;
         case 'S':
             this.y=this.y-1;
             break;
         case 'E':
             this.x=this.x+1;
             break;
         case 'W':
             this.x=this.x-1;
             break;
     }    
 }
}
