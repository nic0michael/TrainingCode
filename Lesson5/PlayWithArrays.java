
public class PlayWithArrays {

    public static void main(String[] args) {
        String[] names ={"Mario","Fernando","Caesar"};
        
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
        
        String[] monthNames = new String[12];        
        
        monthNames[ 0 ] = "January";
        monthNames[ 1 ] = "February";
        monthNames[ 2 ] = "March";
        monthNames[ 3] = "April";
        monthNames[ 4 ] = "May";
        monthNames[ 5 ] = "June";
        monthNames[ 6 ] = "July";
        monthNames[ 7 ] = "August";
        monthNames[ 8 ] = "September";
        monthNames[ 9 ] = "October";
        monthNames[ 10 ] = "November";
        monthNames[ 11 ] = "December";
        
        for(int i=0;i<monthNames.length;i++){
            System.out.println("Index "+i+" "+monthNames[i]);
        }
    }
}
