package builder;

public class BuilderEverydayDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("This is an example ");

        builder.append("of the builder pattern. ");

        builder.append("It has methods to append ");

        builder.append("almost anything we want to a String. ");

        builder.append(42);

        //Since its STRINGbuilder, they didn't make a .build() method for us and took advantage
        //of .toString()
        System.out.println(builder.toString());
    }



}
