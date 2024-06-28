package Articles;

public class Article {
    //полета -> характеристики
    private String title;
    private String content;
    private String author;

    //конструктор -> съзадаваме обекти от класа
    public Article (String title, String content, String author) {
        //нов празен обект
        this.title = title;
        this.content = content;
        this.author = author;
    }

    //методи -> дейности

    //edit -> промяна на текущото съдържание
    public void edit (String newContent) {
        this.content = newContent;
    }

    //change author -> промяна на текущия автор
    public void changeAuthor (String newAuthor) {
        this.author = newAuthor;
    }

    //rename -> промяна на текущото заглавие
    public void rename (String newTitle) {
        this.title = newTitle;
    }

    //toString -> "{title} - {content}: {author}"
    @Override
    public String toString() {
        return this.title + " - " + this.content + ": " + this.author;
    }

}
