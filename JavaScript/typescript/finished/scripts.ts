type Weapon = "Rusty Sword" | "Sword" | "Bow and Arrow" | "Mace" | "Wand";

class Character {
  #name: string;
  #healthPoints: number;
  #attackPower: number;

  constructor(name: string, healthPoints: number, attackPower: number) {
    this.#name = name;
    this.#healthPoints = healthPoints;
    this.#attackPower = attackPower;
  }

  getName() {
    return this.#name;
  }

  getHealthPoints() {
    return this.#healthPoints;
  }

  setHealthPoints(newHealthPoints: number) {
    this.#healthPoints = newHealthPoints;
  }

  getAttackPower() {
    return this.#attackPower;
  }

  attack(target: Character, weapon: Weapon) {
    target.setHealthPoints(target.getHealthPoints() - this.getAttackPower());
    console.log(`${this.getName()} attacked ${target.getName()} with a ${weapon}`);
  }
}

class Player extends Character {
  #weaponsList: Array<Weapon> = [];

  constructor(name: string) {
    super(name, 100, 20);
    this.#weaponsList.push("Rusty Sword");
  }

  getWeaponsList() {
    return this.#weaponsList;
  }

  pickupWeapon(weapon: Weapon) {
    this.getWeaponsList().push(weapon);
  }

}

class Enemy extends Character {
  
  #weapon: Weapon;

  constructor(name: string, weapon: Weapon) {
    super(name, 100, 10);
    this.#weapon =  weapon;
  }

  getWeapon() {
    return this.#weapon;
  }

  attack(target: Character) {
    super.attack(target, this.#weapon);
  }
}

const atreus = new Player("Atreus");

const heimdall = new Enemy("Heimdall", "Sword");

atreus.pickupWeapon("Bow and Arrow");

atreus.attack(heimdall, atreus.getWeaponsList().find(weapon => weapon = "Bow and Arrow"));

console.log(heimdall.getHealthPoints());

