public class GererArvore
{
    private Palavra root;

    public void adicionaNaArvore(String pal)
    {
        this.root = adiciona(this.root,pal);
    }
    private Palavra adiciona(Palavra current,String pal)
    {
        if(current==null)
        {
            current=new Palavra(pal);
            return current;
        }
        if(current.getPalavra().compareToIgnoreCase(pal)<0)
        {
           current.setRight(adiciona(current.getRight(),pal));

        }else if(current.getPalavra().compareToIgnoreCase(pal)>0)
        {
            current.setLeft(adiciona(current.getLeft(),pal));
        }
        return current;
    }
    public void printInordem()
    {
        print(this.root);
    }
    private void print(Palavra root)
    {
        if (root!=null)
        {
            print(root.getLeft());
            System.out.println(root.getPalavra());
            print(root.getRight());
        }
    }
    public void search(String pal)
    {
        System.out.println(privateSearch(this.root,pal));
    }
    private Palavra privateSearch(Palavra root, String pal)
    {
        if (root ==null || root.getPalavra().equalsIgnoreCase(pal))
        {
            return root;
        }
        if(root.getPalavra().compareToIgnoreCase(pal)<0)
        {
            return privateSearch(root.getRight(),pal);
        }else
        {
            return privateSearch(root.getLeft(),pal);
        }


    }

}
