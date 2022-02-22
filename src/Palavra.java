public class Palavra
{
    private String palavra;
    private Palavra left;
    private Palavra right;

    public Palavra(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public Palavra getLeft() {
        return left;
    }

    public void setLeft(Palavra left) {
        this.left = left;
    }

    public Palavra getRight() {
        return right;
    }

    public void setRight(Palavra right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Palavra{" +
                "palavra='" + palavra + '\'' +
                '}';
    }
}
