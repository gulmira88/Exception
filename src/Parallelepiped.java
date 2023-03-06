public class Parallelepiped {
    private int height;
    private  int weight;
    private int length;
    private  int width;
    public Parallelepiped() {
    }

    public Parallelepiped(int height, int weight,int length, int width) {
        this.height = height;
        this.weight = weight;
        this.length =length;
        this.width = width;
    }
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int findSquare(int height, int length, int width){
      int result=2*((height * length) + (length * width) + (height * width));
        return result;
    }
    public int findVolume(int height, int length) {
        int result1 = (length * width * height);
        return result1;


    }

    @Override
    public String toString() {
        return "Parallelepiped:" +
                "height:" + height +
                "\n weight:" + weight +
                "\n width:" + width +
                '\n';
    }
}
