public class cpu{
    float price;
    public cpu(float price)
    {
        this.price=price;
    }

    class processor{
        int no_of_cores;
        String manufacturer;
        public processor(int no_of_cores,String manufacturer)
        {
            this.no_of_cores=no_of_cores;
            this.manufacturer=manufacturer;
           
        }
        void display()
        {
            System.out.println("no of cores: "+no_of_cores);
            System.out.println("manufacturer: "+manufacturer);
        }
    }
    public static class ram{
         static int memory;
       static String manufacturer;
        static public void ramdata(int memory1,String manufacturer1)
        {
            memory=memory1;
            manufacturer=manufacturer1;
        }
        static void display()
        {
            System.out.println("memory: "+memory);
            System.out.println("manufacturer: "+manufacturer);
        }
    }
    public static void main(String args[])
    {
        cpu.processor obj=new cpu(20000).new processor(4,"intel");
        obj.display();
        cpu.ram.ramdata(600,"asus");
        cpu.ram.display();
        
    }
}
