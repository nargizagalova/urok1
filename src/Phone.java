public class Phone {

    int number;

    String model;

    int weight;

    public void receiveCall(String soz){
        System.out.println(number + "number" + model + "model" + weight + "weight");
        System.out.println(soz + "звонок от");
    }
}
