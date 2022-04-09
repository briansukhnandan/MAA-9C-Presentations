class Planet {

  public String name;
  public float time_of_rotation;
  public float time_of_revolution;
  public String type;
  public int num_of_moons;
  public double diameter_of_planet;
  public double gravity;
  public double mass_of_planet;

  public Planet(String n, float t_Ro, float t_Re, String t, int nOm, double d, double g, double mOp) {

    this.name = n;
    this.time_of_rotation = t_Ro;
    this.time_of_revolution = t_Re;
    this.type = t;
    this.num_of_moons = nOm;
    this.diameter_of_planet = d;
    this.gravity = g;
    this.mass_of_planet = mOp;
    
  }

  public double calculateGravitationalForce(double objectMass) {
    return (.00000000006673 * this.mass_of_planet * objectMass) / Math.pow(this.diameter_of_planet / 2, 2);
  }

  public double calculateGravitationalAcceleration() {
    return (.00000000006673 * this.mass_of_planet) / Math.pow(this.diameter_of_planet / 2, 2);
  }
  
}