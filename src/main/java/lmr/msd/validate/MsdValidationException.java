package lmr.msd.validate;

import lmr.msd.models.Stage;

public abstract class MsdValidationException extends Exception {
    public final Stage stage;

    public MsdValidationException(String s, Stage stage) {
        super(s);
        this.stage = stage;
    }
}
