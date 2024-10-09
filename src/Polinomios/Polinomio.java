package Polinomios;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Daniel Ramos
 */
public class Polinomio {

    public Polinomio() {
        llenar_exp();
    }
    
    static 
    
    void copymat(ArrayList<ArrayList<Boolean>> mat1, ArrayList<ArrayList<Boolean>> mat2) {
        for(int i = 0; i < mat1.size(); ++i) {
            mat2.add(new ArrayList<>());
            for(int j = 0; j < mat1.get(i).size(); ++j) {
                mat2.get(i).add(mat1.get(i).get(j));
            }
        }
    }
    
    boolean no_edges(ArrayList<ArrayList<Boolean>> mat) {
        for(int i = 0; i < mat.size(); ++i) {
            for(int j = i + 1; j < mat.size(); ++j) {
                if(mat.get(i).get(j)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    edge first_edge(ArrayList<ArrayList<Boolean>> mat) {
        for(int i = 0; i < mat.size(); ++i) {
            for(int j = i + 1; j < mat.size(); ++j) {
                if(mat.get(i).get(j)) {
                    return new edge(i, j);
                }
            }
        }
        return new edge(0, 0);
    }
    
    ArrayList<ArrayList<Boolean>> deletion(ArrayList<ArrayList<Boolean>> mat, edge edge) {
        mat.get(edge.u).set(edge.v, false);
        mat.get(edge.v).set(edge.u, false);
        return mat;
    }
    
    ArrayList<ArrayList<Boolean>> contraction(ArrayList<ArrayList<Boolean>> mat, edge edge) {
        ArrayList<ArrayList<Boolean>> res = new ArrayList<>();
        for(int i = 0; i < mat.size(); ++i) {
            if(i == edge.u || i == edge.v) {
                continue;
            }
            ArrayList<Boolean> arr = new ArrayList<>();
            for(int j = 0; j < mat.size(); ++j) {
                if(j != edge.u && j != edge.v) {
                    arr.add(mat.get(i).get(j));
                }
            }
            res.add(arr);
        }

        int ini = 0;
        for(int i = 0; i < mat.size(); ++i) {
            if(i != edge.u && i != edge.v) {
                res.get(ini).add(mat.get(i).get(edge.u) | mat.get(i).get(edge.v));
                ++ini;
            }
        }

        res.add(new ArrayList<>());
        int size = res.size() - 1;
        for(int j = 0; j < mat.size(); ++j) {
            if(j != edge.u && j != edge.v) {
                res.get(size).add(mat.get(edge.u).get(j) | mat.get(edge.v).get(j));
            }
        }
        
        res.get(size).add(false);
        return res;
    }
    
    String chromatic(ArrayList<ArrayList<Boolean>> mat) {
        if(no_edges(mat)) {
            return "x" + Integer.toString(mat.size());
        } else {
            edge edge = first_edge(mat);
            ArrayList<ArrayList<Boolean>> matc = new ArrayList<>();
            copymat(mat, matc);
            return chromatic(deletion(mat, edge)) + "-(" + chromatic(contraction(matc, edge)) + ")";
        }
    }
    
    LinkedList<Integer> traductor(int n, String fun) {
        LinkedList<Integer> res = new LinkedList<>();
        for(int i = 0; i < n + 1; ++i) {
            res.add(0);
        }
        int signo = 1;
        LinkedList<Integer> ant = new LinkedList<>();
        for(int i = 0; i < fun.length(); ++i) {
            if(fun.charAt(i) == 'x') {
                ++i;
                res.set(fun.charAt(i) - '0', res.get(fun.charAt(i) - '0') + signo);
            } else if(fun.charAt(i) == '-') {
                ant.add(-1);
                signo *= -1;
                ++i;
            } else if(fun.charAt(i) == ')') {
                signo *= ant.getLast(); ant.removeLast();
            }
        }
        return res;
    }
    
    static boolean signo(int n) {
        return n >= 0;
    }

    static public LinkedList<String> exp = new LinkedList<>();

    private void llenar_exp() {
        exp.add("\u2070");
        exp.add("\u00B9");
        exp.add("\u00B2");
        exp.add("\u00B3");
        exp.add("\u2074");
        exp.add("\u2075");
        exp.add("\u2076");
        exp.add("\u2077");
        exp.add("\u2078");
        exp.add("\u2079");
    }

    String imprime_polinomio(LinkedList<Integer> res) {
        String pol = "";
        for(int i = res.size() - 1; i >= 0; --i) {
            if(res.get(i).equals(0)) {
                continue;
            }
            String poli = "";
            if(i != res.size() - 1) {
                boolean aux = signo(res.get(i));
                String signo = (aux == false) ? "-" : "+";
                poli = " " + signo + " ";
            }
            if(abs(res.get(i)) != 1) {
                poli += Integer.toString((int)abs(res.get(i)));
            }
            poli += "\u03BB";
            if(i != 1) {
                poli += exp.get(i);
            }
            pol += poli;
        }
        return pol;
    }
}
