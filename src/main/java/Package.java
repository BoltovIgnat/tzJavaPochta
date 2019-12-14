public class Package extends Parallelepiped {
    public boolean isValidBox(Box box){

        double packV = this.getCapacity();
        double boxV = box.getCapacity();

        if (boxV <= packV){
            return true;
        }else{
            return false;
        }

    }
}
