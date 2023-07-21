package class_02;

class Address implements IAddress {
        private String city;
        private String street;
        private Integer number;

        public void setCity(String city) {
            this.city = city;
        }
        public String getCity() {
            return this.city;
        }

        public void setStreet(String street) {
            this.street = street;
        }
        public String getStreet() {
            return this.street;
        }

        public void setBuildingNumber(Integer number) {
            this.number = number;
        }
        public Integer getBuildingNumber() {
            return this.number;
        }
    }
