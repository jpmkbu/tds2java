/**
 * Represents a dog inside the program
 *
 * @author jp
 */

public class Dog {


    /**
     * The name of the dog
     */
    String name;
    //int barkCount;


    /**
     * The weight of the dog
     */
    int weight;


    /**
     * 
     */
    boolean hungry;

    /**
     * constructor
     *
     * @param name the name of the dog
     * @param weight the weight of the dog
     */
    public Dog(String name, int weight) {
        this.name = name;
        //this.barkCount = 0;
        this.weight = weight;

    }


    /**
     * tell the dog to bark
     */
    void bark() {
        if (weight < 10) {
            System.out.println(this.name + " a dit Yip yip!");
        } else if (weight > 30) {
            System.out.println(this.name + " a dit WOUUUF!");
        } else {
            System.out.println(this.name + " a dit Wouf!");
        }

        //this.barkCount++;
        //System.out.println(this.name + " a déjà aboyé " + this.barkCount + "fois");
    }


}
