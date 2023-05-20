class String2
{
    public static void main(String[] args)
    {
        String brand = "deluxe";
        System.out.println(brand);
        brand.concat("rubber");
        System.out.println(brand);

        StringBuilder brand1 = new StringBuilder("deluxe");
        System.out.println(brand1);
        brand1.append("rubber");
        System.out.println(brand1);
        
    }
}