public class CatAndMouse {

    static String catAndMouse(int x, int y, int z){
        int distanceA = Math.abs(x-z);
        int distanceB = Math.abs(y-z);

        if (distanceA < distanceB ){
            return "Cat A";
        } if (distanceA > distanceB){
            return "Cat B";
        } else {
            return "Mouse C";
        }


    }

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        catAndMouse(x, y, z);
    }
}
