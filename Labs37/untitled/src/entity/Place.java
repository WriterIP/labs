package entity;

/**
 * @author Ihor Pysmennyi
 *         класс, описывающий заведение
 */
public class Place {

    /**
     * уникальный числовой идентефикатор
     */
    private int id;

    /**
     * массив тегов, характеризирующих данное место
     */
    private String[] tags;

    /**
     * имя заведения (если есть)
     */
    private String name;

    /**
     * адресс, если есть
     */
    private String address;

    /**
     * географичесская долгота
     */
    private double lon;

    /**
     * географичесская широта
     */
    private double lat;

    /**
     * колличество посетивших
     */
    private long peopleCount = 0;

    /**
     * рейтинг
     */
    private double rank = 4.;

    /**
     * колличевство проголосовавших
     */
    private long peopleVoted = 1;

    /**
     * среднее время припровождения,min
     */
    private double avTime=45;

    /**
     * время открытия
     */
    private double openhr;

    /**
     * время окончания рабочего дня
     */
    private double closehr;

    /**
     * @param id уникальный числовой идентефикатор
     */
    public Place(int id) {
        this.id = id;
    }

    /**
     * @return уникальный числовой идентефикатор
     */
    public int getId() {
        return id;
    }

    /**
     * @param id уникальный числовой идентефикатор
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return массив тегов, характеризирующих данное место
     */
    public String[] getTags() {
        return tags;
    }

    /**
     * @param tags массив тегов, характеризирующих данное место
     */
    public void setTags(String[] tags) {
        this.tags = tags;
    }

    /**
     * @return имя заведения (если есть)
     */
    public String getName() {
        return name;
    }

    /**
     * @param name имя заведения (если есть)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return адресс
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address адресс
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return географичесская долгота
     */
    public double getLon() {
        return lon;
    }

    /**
     * @param lon географичесская долгота
     */
    public void setLon(double lon) {
        this.lon = lon;
    }

    /**
     * @return географичесская широта
     */
    public double getLat() {
        return lat;
    }

    /**
     * @param lat географичесская широта
     */
    public void setLat(double lat) {
        this.lat = lat;
    }

    /**
     * @return колличество посетивших
     */
    public long getPeopleCount() {
        return peopleCount;
    }

    /**
     * @param peopleCount колличество посетивших
     */
    public void setPeopleCount(long peopleCount) {
        this.peopleCount = peopleCount;
    }

    /**
     * @return рейтинг
     */
    public double getRank() {
        return rank;
    }

    /**
     * @param rank рейтинг
     */
    public void setRank(double rank) {
        this.rank = rank;
    }

    /**
     * @return колличевство проголосовавших
     */
    public long getPeopleVoted() {
        return peopleVoted;
    }

    /**
     * @param peopleVoted колличевство проголосовавших
     */
    public void setPeopleVoted(long peopleVoted) {
        this.peopleVoted = peopleVoted;
    }

    /**
     * @return среднее время припровождения,min
     */
    public double getAvTime() {
        return avTime;
    }

    /**
     * @param avTime среднее время припровождения,min
     */
    public void setAvTime(double avTime) {
        this.avTime = avTime;
    }

    /**
     * @return время открытия
     */
    public double getOpenhr() {
        return openhr;
    }

    /**
     * @param openhr время открытия
     */
    public void setOpenhr(double openhr) {
        this.openhr = openhr;
    }

    /**
     * @return время окончания рабочего дня
     */
    public double getClosehr() {
        return closehr;
    }

    /**
     * @param closehr время окончания рабочего дня
     */
    public void setClosehr(double closehr) {
        this.closehr = closehr;
    }


}
