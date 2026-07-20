ServerEvents.recipes(event => {
  // 巫师手礼
  event.shapeless(
    Item.of('patchouli:guide_book', '{"patchouli:book":"better_ebwizardry:wizard_handbook"}'),
    [
      "minecraft:book",
      "ebwizardry:magic_crystal",
      "ebwizardry:magic_crystal"
    ]
  ).id("better_ebwizardry:wizard_handbook");
})