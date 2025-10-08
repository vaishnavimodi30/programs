public class CharMethod {
    public static void main(String[] args) {
        char ch = 'A';

        System.out.println("isLetter: " + Character.isLetter(ch));
        System.out.println("isDigit: " + Character.isDigit(ch));
        System.out.println("isLetterOrDigit: " + Character.isLetterOrDigit(ch));
        System.out.println("isUpperCase: " + Character.isUpperCase(ch));
        System.out.println("isLowerCase: " + Character.isLowerCase(ch));
        System.out.println("toLowerCase: " + Character.toLowerCase(ch));
        System.out.println("isJavaIdentifierStart: " + Character.isJavaIdentifierStart(ch));
        System.out.println("Converts to uppercase: "+Character.toUpperCase(ch));
        System.out.println("Converts to lowercase: "+Character.toLowerCase(ch));
        System.out.println(" Converts first letter to title case: "+Character.toTitleCase(ch));
        System.out.println("Gets numeric value of a digit/letter: "+Character.getNumericValue(ch));
        System.out.println("Checks if a char can appear inside a Java variable name: "+Character.isJavaIdentifierPart(ch));
        System.out.println("Tells how many char units needed to represent a Unicode character: "+Character.charCount( ch));
        System.out.println("Returns the type of the character (like LETTER, DIGIT, PUNCTUATION, etc.): "+ Character.getType(ch));
    }
}
