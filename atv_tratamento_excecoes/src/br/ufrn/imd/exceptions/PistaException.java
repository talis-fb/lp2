package br.ufrn.imd.exceptions;

public class PistaException extends Exception {
    public PistaException(String msg, Exception exp) {
        super(msg, exp);
    }
}
