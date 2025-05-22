package com.design.patterns.structural.facade;

/**
 * Facade class that provides a simplified interface to the home theater system.
 */
public class HomeTheaterFacade {
    private Amplifier amp;
    private Tuner tuner;
    private DvdPlayer dvd;
    private CdPlayer cd;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;
    
    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, 
                            CdPlayer cd, Projector projector, Screen screen,
                            TheaterLights lights, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }
    
    /**
     * Watch a movie with a simplified interface.
     * @param movie The movie to watch
     */
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        
        dvd.on();
        dvd.play(movie);
    }
    
    /**
     * End the movie and turn everything off.
     */
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
    
    /**
     * Listen to a CD.
     * @param cdTitle The title of the CD
     * @param track The track number to play
     */
    public void listenToCd(String cdTitle, int track) {
        System.out.println("Get ready for an audio experience...");
        lights.on();
        amp.on();
        amp.setVolume(5);
        amp.setCd(cd);
        amp.setStereoSound();
        cd.on();
        cd.play(cdTitle);
        cd.play(track);
    }
    
    /**
     * End listening to the CD.
     */
    public void endCd() {
        System.out.println("Shutting down CD...");
        amp.off();
        amp.setCd(cd);
        cd.eject();
        cd.off();
    }
    
    /**
     * Listen to the radio.
     * @param frequency The frequency to tune to
     */
    public void listenToRadio(double frequency) {
        System.out.println("Tuning in to the airwaves...");
        tuner.on();
        tuner.setFrequency(frequency);
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }
    
    /**
     * Turn off the radio.
     */
    public void endRadio() {
        System.out.println("Shutting down the tuner...");
        tuner.off();
        amp.off();
    }
}
