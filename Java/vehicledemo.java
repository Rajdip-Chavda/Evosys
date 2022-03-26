/* A program that uses the vechicle class.
    call this file vehicledemo.java
*/
class vechicle{
    int passengers;//number of passengers
    int fulecap;//fuel capacity in gallons
    int mpg;// fuel consumption in miles per gallon
}
//this class declares an object of type vehicle
class vehicledemo{
    public static void main(String args[])
    {
        vechicle minivan=new vechicle();
        int range;
        //assign values to fields in minivan
        minivan.passengers=7;
        minivan.fulecap=16;
        minivan.mpg=21;
        //computer the range assuming a full tank of gas
        range=minivan.fulecap * minivan.mpg;
        System.out.println("minivan can carry " + minivan.passengers + " with a range of "+ range);
    }
}