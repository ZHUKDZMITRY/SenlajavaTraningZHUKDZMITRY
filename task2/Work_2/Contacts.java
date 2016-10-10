public class Contacts {
        private Long id;
        private String phone;
        private String adress;
        private String email;

    public Contacts(){
        System.out.println("Contacts");
    }
        public String getPhone() {
            return this.phone;
        }
        public void setPhone(String phone) {
            this.phone = phone;
        }
        public String getAdress() {
            return this.adress;
        }
        public void setAdress(String adress) {
            this.adress = adress;
        }
        public String getEmail() {
            return this.email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public Long getId() {
            return this.id;
        }
        public void setId(Long id) {
            this.id = id;
        }


}
