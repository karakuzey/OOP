public interface Subject {
    public void appendObservers(Observer observer);

    public void removeObservers(Observer observer);

    public void notifyObservers();
}
