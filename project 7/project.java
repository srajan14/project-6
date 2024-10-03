 class shape{
    public double getvolume(){
        return 0;

    }
        
    }
 class cube extends shape{
    private  double side;
    public cube(double side){
        this.side=side;

    }
    public double getarea(){
        return side*side*side;
    }
 }
 class project{
    public static void main(String[] args) {
        shape[] shape=new shape[0]; 
        shape[0]=new cube(4);
        System.out.println("volume of cube"+shape[0].getvolume());

    }
}