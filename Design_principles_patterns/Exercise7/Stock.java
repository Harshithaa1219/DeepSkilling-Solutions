package Exercise7;

public interface Stock {
  public void registerObserver(Observer observer);
  public void removeObserver(Observer observer);
  public void notifyObservers();
}
