package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {
    private Integer idStream;
    private List<StudentGroup> stream;

    public void setIdStream(Integer idStream) {
        this.idStream = idStream;
    }

    /**
     * наполняет поток коллкцией групп студентов
     * 
     * @param stream - набор групп в List коллекции
     */
    public void setStream(List<StudentGroup> stream) {
        this.stream = stream;
    }

    public Integer getIdStream() {
        return idStream;
    }

    public List<StudentGroup> getStream() {
        return stream;
    }
    public StudentStream(Integer idStream, List<StudentGroup> stream) {
        this.idStream = idStream;
        this.stream = stream;
    }

    @Override // перезапись итератора
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < stream.size();
            }

            @Override
            public StudentGroup next() {
                return stream.get(index++);
            }
        };
    }

    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Stream{Stream ID: ");
        sb.append(this.idStream);
        sb.append(" | Group Count: ");
        sb.append(this.getStream().size());
        sb.append("\n");
        for(StudentGroup studentGroup : this.stream) {
            sb.append(studentGroup);
            sb.append("\n");
            }
        // т.к. мы добовляли \n после каждого вывода группы, надо удалить последний \n
        // и заменить его на } чтобы закрыть скобочку потока
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '\n') {
            sb.replace(sb.length() - 1, sb.length(), "}");
        }
        return sb.toString();
    }
}
