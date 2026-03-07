package RedRover.HW9.codewars;
//Write a class Block that creates a block (Duh..)
//Requirements
//The constructor should take an array as an argument, this will contain 3 integers of the form
// [width, length, height] from which the Block should be created.
//Define these methods:
//`getWidth()` return the width of the `Block`
//`getLength()` return the length of the `Block`
//`getHeight()` return the height of the `Block`
//`getVolume()` return the volume of the `Block`
//`getSurfaceArea()` return the surface area of the `Block`
public class Block {
private int width;
private int height;
private int length;

    public Block(int[] dimensions) {
        this.width = dimensions[0];
        this.length = dimensions[1];
        this.height = dimensions[2];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }
    public int getVolume(){
        return this.length*this.width*this.height;
    }
    public int getSurfaceArea(){
        return 2*(this.length*this.width + this.width*this.height + this.length*this.height);
    }
}
