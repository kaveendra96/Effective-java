public class MobilePhone {

    private String os;
    private String camera;
    private Boolean is4GEnabled;
    private Boolean isSimLocked;
    private Integer batteryCapasity;

    public MobilePhone(Builder builder) {
        this.os = builder.os;
        this.camera = builder.camera;
        this.is4GEnabled = builder.is4GEnabled;
        this.isSimLocked = builder.isSimLocked;
        this.batteryCapasity = builder.batteryCapasity;
    }

    static class Builder {
        private String os;
        private String camera;
        private Boolean is4GEnabled;
        private Boolean isSimLocked;
        private Integer batteryCapasity;
        
        public Builder(String os) {
            this.os = os;
        }
        
        public MobilePhone build(){
            return new MobilePhone(this);
        }

        public Builder camera(String camera) {
            this.camera = camera;
            return this;
        }

        public Builder is4GEnabled(Boolean is4GEnabled) {
            this.is4GEnabled = is4GEnabled;
            return this;
        }

        public Builder isSimLocaked(Boolean isSimLocked) {
            this.isSimLocked = isSimLocked;
            return this;
        }

        public Builder batteryCapasity(Integer batteryCapasity) {
            this.batteryCapasity = batteryCapasity;
            return this;
        }
        
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "os='" + os + '\'' +
                ", camera='" + camera + '\'' +
                ", is4GEnabled=" + is4GEnabled +
                ", isSimLocked=" + isSimLocked +
                ", batteryCapasity=" + batteryCapasity +
                '}';
    }
}
