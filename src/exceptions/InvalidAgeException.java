/*
 * Copyright 2023 LaaroussiMedAziz
 *
 *  This code is written for fun and learning.
 *  Feel free to use it, share it, modify it!
 * Just don't forget to credit the original author.
 *  And remember to stay awesome!
 */

package exceptions;

public class InvalidAgeException extends Exception {

    public InvalidAgeException() {
    }

    public InvalidAgeException(String msg) {
        super(msg);
    }
}
