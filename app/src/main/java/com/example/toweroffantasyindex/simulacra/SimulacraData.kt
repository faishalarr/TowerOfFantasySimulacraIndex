package com.example.toweroffantasyindex.simulacra

object SimulacraData {
    private var data = arrayOf(
        arrayOf(
            "Bai Ling",
            "SR",
            "https://toweroffantasy.info/static/images/art/bailing.webp",
            "Nightingale's Feather\n",
            "DPS",
            "Physical",
            "6.00",
            "10.00",
            "Attack\n" +
                    "Health\n" +
                    "Crit",
            "Grievous",
            "Fully charged weapons will inflict damage equal to 137.00% of ATK with the next attack, and make the target grievous for 7 seconds, taking 20% extra damage."
        ),
        arrayOf(
            "Claudia",
            "SSR",
            "https://static.wikia.nocookie.net/toweroffantasy/images/8/86/Simulacrum_Claudia_Prototype.png/revision/latest?cb=20220819012245",
            "Guren Blade",
            "DPS",
            "Physical",
            "7.50",
            "12.50",
            "Attack\n" +
                    "Resitance\n" +
                    "Health",
            "Grievous",
            "Fully charged weapons will inflict damage equal to 137.00% of ATK with the next attack, and make the target grievous for 7 seconds, taking 20% extra damage."
        ),
        arrayOf(
            "Cocoriter",
            "SSR",
            "https://toweroffantasy.info/static/images/art/cocoritter.webp",
            "Absolute Zero",
            "Support",
            "Frost",
            "12.50",
            "4.00",
            "Attack\n" +
                    "Resitance\n" +
                    "Health",
            "Ice Shell",
            "Fully charged weapons will freeze the target for 2 seconds and leave it frostbitten for 6 seconds. Breaking the ice shell causes additional damage equal to 151.00% of ATK. While frostbitten, the target's weapon charge rate is reduced by 50%."
        ),
        arrayOf(
            "Cobalt-B",
            "SSR",
            "https://toweroffantasy.info/static/images/art/cobalt-b.webp",
            "Flaming Revolver",
            "DPS",
            "Flame",
            "12.50",
            "10.00",
            "Attack\n" +
                    "Health\n" +
                    "Crit",
            "Flame",
            "Fully charged weapons will set the target on fire for 8 seconds with the next attack, causing ongoing damage of 58.00% of ATK every second. Ignited targets receive 50% efficacy from healing.\n"
        ),
        arrayOf(
            "Crow",
            "SSR",
            "https://toweroffantasy.wiki/images/2/24/Crow_Official_Pic_2022-08-15.png",
            "Thunderblades",
            "DPS",
            "Volt",
            "8.00",
            "6.00",
            "Attack\n" +
                    "Health\n" +
                    "Crit",
            "Volt",
            "When the weapon is fully charged, the next attack will paralyze targets for 1 second and electrify them for 6 seconds, negating all buffs and dealing damage equal to 144.00% of ATK. Targets can't receive any buffs for the next 6 seconds."
        ),
        arrayOf(
            "Echo",
            "SSR",
            "https://toweroffantasy.info/static/images/art/echo.webp",
            "Thunderous Halberd",
            "DPS",
            "Volt",
            "11.00",
            "7.00",
            "Attack\n" +
                    "Resitance\n" +
                    "Health",
            "Volt",
            "When the weapon is fully charged, the next attack will paralyze targets for 1 second and electrify them for 6 seconds, negating all buffs and dealing damage equal to 144.00% of ATK. Targets can't receive any buffs for the next 6 seconds."
        ),
        arrayOf(
            "Frigg",
            "SSR",
            "https://toweroffantasy.info/static/images/art/frigg.webp",
            "Balmung",
            "DPS",
            "Frost",
            "8.050",
            "8.00",
            "Attack\n" +
                    "Health\n" +
                    "Crit",
            "Ice Shell",
            "Fully charged weapons will freeze the target for 2 seconds and leave it frostbitten for 6 seconds. Breaking the ice shell causes additional damage equal to 151.00% of ATK. While frostbitten, the target's weapon charge rate is reduced by 50%."
        ),
        arrayOf(
            "Huma",
            "SSR",
            "https://static.wikia.nocookie.net/toweroffantasy/images/b/b7/Simulacrum_Huma_Prototype.png/revision/latest?cb=20220817061109",
            "Molten Shield V2",
            "Defense",
            "Flame",
            "10.00",
            "10.00",
            "Attack\n" +
                    "Resistance\n" +
                    "Health",
            "Flame",
            "Fully charged weapons will set the target on fire for 8 seconds with the next attack, causing ongoing damage of 58.00% of ATK every second. Ignited targets receive 50% efficacy from healing.\n"
        ),
        arrayOf(
            "King",
            "SSR",
            "https://static.wikia.nocookie.net/toweroffantasy/images/d/d6/Simulacrum_KING_Prototype.png/revision/latest?cb=20220817061303",
            "Sycthe of the Crow",
            "DPS",
            "Flame",
            "12.50",
            "5.00",
            "Attack\n" +
                    "Resistance\n" +
                    "Health",
            "Flame",
            "Fully charged weapons will set the target on fire for 8 seconds with the next attack, causing ongoing damage of 58.00% of ATK every second. Ignited targets receive 50% efficacy from healing.\n"
        ),
        arrayOf(
            "Meryl",
            "SSR",
            "https://static.wikia.nocookie.net/toweroffantasy/images/f/f7/Simulacrum_Meryl_Prototype.png/revision/latest?cb=20220817061509",
            "Rosy Edge",
            "DPS",
            "Frost",
            "12.00",
            "4.00",
            "Attack\n" +
                    "Resistance\n" +
                    "Health",
            "Ice Shell",
            "Fully charged weapons will freeze the target for 2 seconds and leave it frostbitten for 6 seconds. Breaking the ice shell causes additional damage equal to 151.00% of ATK. While frostbitten, the target's weapon charge rate is reduced by 50%."
        ),

    )
    val listData: ArrayList<SimulacraModel>
        get() {
            val list = ArrayList<SimulacraModel>()
            for (aData in data) {
                val simulacra = SimulacraModel()
                simulacra.name = aData[0]
                simulacra.rarity = aData[1]
                simulacra.image = aData[2]
                simulacra.weapname = aData[3]
                simulacra.resonance = aData[4]
                simulacra.element = aData[5]
                simulacra.shatter = aData[6]
                simulacra.charge = aData[7]
                simulacra.substat = aData[8]
                simulacra.elereso = aData[9]
                simulacra.weap_reso = aData[10]

                list.add(simulacra)
            }
            return list
        }
}
