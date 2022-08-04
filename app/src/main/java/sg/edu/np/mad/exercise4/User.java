package sg.edu.np.mad.exercise4;

public class User {
        public String name;
        public String description;
        public int id;
        public boolean followed;

        public User(){

        }

        public User(String Name, String Description, Integer ID, Boolean Followed){
            this.name = Name;
            this.description = Description;
            this.id = ID;
            this.followed = Followed;
        }

        public String getName() { return name; }

        public void setName(String username) {
            this.name = name;
        }

        public String getDesc() { return description; }

        public void setDesc(String password) {
            this.description = description;
        }

        public Integer getID() {return id; }

        public void setID(Integer ID) { this.id = id; }


        public boolean getFollowed() {
            return followed;
        }

        public void setFollowed(boolean followed) {
            this.followed = followed;
        }
    }
