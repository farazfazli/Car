/**
 * Created by farazfazli on 1/7/16.
 */
class Car {
    private String mColor;
    private String mDrivetrain;
    private String mBodyType;
    private String mTrim;
    private String mInterior;
    private String mPackage;
    private int mHorsepower;
    private int mTopSpeed;
    private int mTorque;
    private float mCoefficientDrag;
    private int mPsi;
    private int mSpeed;
    private boolean mPowerState;
    private boolean mPushToStart;

    public Car(String mColor, String mDrivetrain, String mBodyType, String mTrim, String mInterior, String mPackage, int mHorsepower, int topSpeed, int torque, float mCoefficientDrag, int mPsi, boolean mPowerState, boolean mPushToStart, int mSpeed) {
        this.mColor = mColor;
        this.mDrivetrain = mDrivetrain;
        this.mBodyType = mBodyType;
        this.mTrim = mTrim;
        this.mInterior = mInterior;
        this.mPackage = mPackage;
        this.mHorsepower = mHorsepower;
        this.mTopSpeed = topSpeed;
        this.mTorque = torque;
        this.mCoefficientDrag = mCoefficientDrag;
        this.mPsi = mPsi;
        this.mPowerState = mPowerState;
        this.mPushToStart = mPushToStart;
        this.mSpeed = mSpeed;
    }

    public String getmColor() {
        return mColor;
    }

    public void setmColor(String mColor) {
        this.mColor = mColor;
    }

    public String getmDrivetrain() {
        return mDrivetrain;
    }

    public void setmDrivetrain(String mDrivetrain) {
        this.mDrivetrain = mDrivetrain;
    }

    public String getmBodyType() {
        return mBodyType;
    }

    public void setmBodyType(String mBodyType) {
        this.mBodyType = mBodyType;
    }

    public String getmTrim() {
        return mTrim;
    }

    public void setmTrim(String mTrim) {
        this.mTrim = mTrim;
    }

    public String getmInterior() {
        return mInterior;
    }

    public void setmInterior(String mInterior) {
        this.mInterior = mInterior;
    }

    public String getmPackage() {
        return mPackage;
    }

    public void setmPackage(String mPackage) {
        this.mPackage = mPackage;
    }

    public int getmHorsepower() {
        return mHorsepower;
    }

    public void setmHorsepower(int mHorsepower) {
        this.mHorsepower = mHorsepower;
    }

    public int getTopSpeed() {
        return mTopSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.mTopSpeed = topSpeed;
    }

    public int getTorque() {
        return mTorque;
    }

    public void setTorque(int torque) {
        this.mTorque = torque;
    }

    public float getmCoefficientDrag() {
        return mCoefficientDrag;
    }

    public void setmCoefficientDrag(float mCoefficientDrag) {
        this.mCoefficientDrag = mCoefficientDrag;
    }

    public int getmPsi() {
        return mPsi;
    }

    public void setmPsi(int mPsi) {
        this.mPsi = mPsi;
    }

    public boolean ismPowerState() {
        return mPowerState;
    }

    public void setmPowerState(boolean mPowerState) {
        this.mPowerState = mPowerState;
    }

    public boolean ismPushToStart() {
        return mPushToStart;
    }

    public void setmPushToStart(boolean mPushToStart) {
        this.mPushToStart = mPushToStart;
    }

    public int getmSpeed() {
        return mSpeed;
    }

    public void setmSpeed(int mSpeed) {
        this.mSpeed = mSpeed;
    }
}
