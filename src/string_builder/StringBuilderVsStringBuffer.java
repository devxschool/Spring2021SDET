package string_builder;

public class StringBuilderVsStringBuffer {

    public static void main(String[] args) {

        //String Buffer is thread safe and synchronized vs String builder is not thread safe and not-synchornized

        //String Builder
        StringBuilder sbuild = new StringBuilder();
        long startTimeForStrBuilder = System.currentTimeMillis();

        for(int i = 0; i < 60000000; i++){
            sbuild.append("Devxschool");
        }

        long endTimeForStrBuilder = System.currentTimeMillis();
        long durationForStrBuilder = endTimeForStrBuilder - startTimeForStrBuilder;
        System.out.println("String builder: "+durationForStrBuilder);
    // String Buffer
        StringBuffer sbuff = new StringBuffer();
        long startTimeForStrBuffer = System.currentTimeMillis();

        for(int i = 0; i < 60000000; i++){
            sbuff.append("Devxschool");
        }

        long endTimeForStrBuffer = System.currentTimeMillis();
        long durationForStrBuffer = endTimeForStrBuffer - startTimeForStrBuffer;
        System.out.println("String buffer: "+durationForStrBuffer);
    }
}
