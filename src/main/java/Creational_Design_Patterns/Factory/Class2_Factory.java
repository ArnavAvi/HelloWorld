package Creational_Design_Patterns.Factory;

import com.epam.Creational_Design_Pattern.Factory.Class1_Factory;

public class Class2_Factory implements Creational_Design_Patterns.Factory.FactoryMehtod {
    @Override
    public void car() {
        System.out.println("Mercedez_Benz");
    }
}
class Type
{
    public Creational_Design_Patterns.Factory.FactoryMehtod getType(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("MERCEDEZ_BENZ")){
            return new Class2_Factory();

        } else if(shapeType.equalsIgnoreCase("BMW")){
            return new Class1_Factory();

        }
        return null;
    }
}
class FactoryPatternDemo {

    public static void main(String[] args) {

    Type type=new Type();
    Creational_Design_Patterns.Factory.FactoryMehtod factoryMehtod= type.getType("BMW");
    factoryMehtod.car();
    Creational_Design_Patterns.Factory.FactoryMehtod factoryMehtod1=type.getType("MERCEDEZ_BENZ");
    factoryMehtod1.car();

    }
}
