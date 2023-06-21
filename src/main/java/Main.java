public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();

        post.name = "Иван";
        post.phone = "+7 (999)-999-99-99";
        post.passport = "4444 № 44444444";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.birthday.day = 13;
        post.birthday.year = 1999;
        post.birthday.mounth = 6;
        post.subscription = true;
    }
}
