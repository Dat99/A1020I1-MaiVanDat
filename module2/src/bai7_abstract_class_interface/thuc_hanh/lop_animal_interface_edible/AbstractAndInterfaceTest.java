package bai7_abstract_class_interface.thuc_hanh.lop_animal_interface_edible;

public class AbstractAndInterfaceTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0]=new Tiger();
        animals[1]=new Chicken();
        for(Animal animal: animals){
            System.out.println(animal.makeSound());
        }
    }
}
