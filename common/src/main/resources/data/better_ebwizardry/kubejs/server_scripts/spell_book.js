ServerEvents.recipes(event => {
  // Locked Book
  event.shapeless(
    Item.of("better_ebwizardry:locked_book", 1),
    [
      Item.of('minecraft:potion', '{Potion:"minecraft:water"}'),
      "ebwizardry:spell_book"
    ]
  );
  // Ignite Spell Book
  event.shaped(
    Item.of("ebwizardry:spell_book", '{Spell:"ebwizardry:ignite"}'),
    [
      " A ",
      " B ",
      " C "
    ],
    {
      A: "ebwizardry:mana_flask_small",
      B: "minecraft:flint_and_steel",
      C: "better_ebwizardry:locked_book"
    }
  ).id("better_ebwizardry:ignite_spell_book");
  // Freeze Spell Book
  event.shaped(
    Item.of("ebwizardry:spell_book", '{Spell:"ebwizardry:freeze"}'),
    [
      " A ",
      " B ",
      " C "
    ],
    {
      A: "ebwizardry:mana_flask_small",
      B: "minecraft:snow_block",
      C: "better_ebwizardry:locked_book"
    }
  ).id("better_ebwizardry:freeze_spell_book");
  // Smoke Bomb Spell Book
  event.shaped(
    Item.of('ebwizardry:spell_book', '{Spell:"ebwizardry:smoke_bomb"}'),
    [
      " A ",
      " B ",
      " C "
    ],
    {
      A: "ebwizardry:mana_flask_small",
      B: "minecraft:gunpowder",
      C: "better_ebwizardry:locked_book"
    }
  ).id("better_ebwizardry:smoke_bomb_spell_book");
  // Snowball Spell Book
  // Arc Spell Book
  event.shaped(
    Item.of('ebwizardry:spell_book', '{Spell:"ebwizardry:arc"}'),
    [
      " A ",
      " B ",
      " C "
    ],
    {
      A: "ebwizardry:mana_flask_small",
      B: "minecraft:iron_ingot",
      C: "better_ebwizardry:locked_book"
    }
  ).id("better_ebwizardry:arc_spell_book");
  // Thunderbolt Spell Book
  event.shaped(
    Item.of('ebwizardry:spell_book', '{Spell:"ebwizardry:thunderbolt"}'),
    [
      " A ",
      " B ",
      " C "
    ],
    {
      A: "ebwizardry:mana_flask_small",
      B: "minecraft:iron_block",
      C: "better_ebwizardry:locked_book"
    }
  ).id("better_ebwizardry:thunderbolt_spell_book");
  // Summon Zombie Spell Book
  event.shaped(
    Item.of('ebwizardry:spell_book', '{Spell:"ebwizardry:summon_zombie"}'),
    [
      " A ",
      " B ",
      " C "
    ],
    {
      A: "ebwizardry:mana_flask_small",
      B: '64x minecraft:rotten_flesh',
      C: "better_ebwizardry:locked_book"
    }
  ).id("better_ebwizardry:summon_zombie_spell_book");
  // Mind Trick Spell Book
  // Snare Spell Book
})