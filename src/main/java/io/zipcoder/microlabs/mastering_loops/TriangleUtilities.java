package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows){
      StringBuilder s = new StringBuilder();

      for (int i = 1; i < numberOfRows; i++){
          s.append(TriangleUtilities.getRow(i));
          s.append('\n');
      }
        return s.toString();
    }





    public static String getRow(int numberOfStars) {


        String stars = "";


        for (int i = 0; i < numberOfStars; i++){


        stars = stars + '*';
    }
        return stars;
    }

    public static String getSmallTriangle() {
    String triangle = "";
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j <= i; j++)

                    triangle = triangle + "\n";
            }
            return triangle;
    }

    public static String getLargeTriangle(){


                 String triangle ="";
                for (int i = 0; i <10-1; i++) {
                    for (int j = 0; j <= i; j++){
                }       triangle = triangle + "\n";
                }


            return triangle;
    }}

