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

    public Car(String color, String drivetrain, String bodyType, String trim, String interior, String aPackage, int horsepower, int topSpeed, int torque, float coefficientDrag, int psi, int speed, boolean powerState, boolean pushToStart) {
        mColor = color;
        mDrivetrain = drivetrain;
        mBodyType = bodyType;
        mTrim = trim;
        mInterior = interior;
        mPackage = aPackage;
        mHorsepower = horsepower;
        mTopSpeed = topSpeed;
        mTorque = torque;
        mCoefficientDrag = coefficientDrag;
        mPsi = psi;
        mSpeed = speed;
        mPowerState = powerState;
        mPushToStart = pushToStart;
    }

    public String getColor() {
        return mColor;
    }

    public void setColor(String color) {
        mColor = color;
    }

    public String getDrivetrain() {
        return mDrivetrain;
    }

    public void setDrivetrain(String drivetrain) {
        mDrivetrain = drivetrain;
    }

    public String getBodyType() {
        return mBodyType;
    }

    public void setBodyType(String bodyType) {
        mBodyType = bodyType;
    }

    public String getTrim() {
        return mTrim;
    }

    public void setTrim(String trim) {
        mTrim = trim;
    }

    public String getInterior() {
        return mInterior;
    }

    public void setInterior(String interior) {
        mInterior = interior;
    }

    public String getPackage() {
        return mPackage;
    }

    public void setPackage(String aPackage) {
        mPackage = aPackage;
    }

    public int getHorsepower() {
        return mHorsepower;
    }

    public void setHorsepower(int horsepower) {
        mHorsepower = horsepower;
    }

    public int getTopSpeed() {
        return mTopSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        mTopSpeed = topSpeed;
    }

    public int getTorque() {
        return mTorque;
    }

    public void setTorque(int torque) {
        mTorque = torque;
    }

    public float getCoefficientDrag() {
        return mCoefficientDrag;
    }

    public void setCoefficientDrag(float coefficientDrag) {
        mCoefficientDrag = coefficientDrag;
    }

    public int getPsi() {
        return mPsi;
    }

    public void setPsi(int psi) {
        mPsi = psi;
    }

    public int getSpeed() {
        return mSpeed;
    }

    public void setSpeed(int speed) {
        mSpeed = speed;
    }

    public boolean isPowerState() {
        return mPowerState;
    }

    public void setPowerState(boolean powerState) {
        mPowerState = powerState;
    }

    public boolean isPushToStart() {
        return mPushToStart;
    }

    public void setPushToStart(boolean pushToStart) {
        mPushToStart = pushToStart;
    }
}