# javastockmarketsimulation
intro to the project which will definely end up no watchers.

subject: hope to simulate the market react based on the pre defined client flux and market changing along the date
principle the structure and elements. the decision of the client group has been made along with the para "mood", and "mood" decide also the nombre of trading, the price trending and the changing of market type. the simu has been made with three principles and three differents tables for data recoding

first three rule :
- price will decided by the wining tendance of market(buying mark or a selling mark, or one-side mark)
- delta of price is decided by rest people in the strong side market(people cant find a deal for the out nombre of strong side
mark against the weak side, to be more precise, by para J, nombre of group the rest in
- mood is function of a list of factors of market stat, people salary, the habit of invest or everything else, but we want a
closer look to the MCT(Mood changing Table) which can describe a personallité de people, and then help us make simu under 
certain market situation, for exemple, 80% poor guy pushing the door while the 20% rich selling slowly, and watch the price fly.

and then three table :
- jbroad(jbroad, jbroad_id, jbroad_nomop) : price_now, cap, buy, sell. actually a report for the register of buying or 
selling willing: at which price, how much
- IDlist : almost the same as jbroad, but as a help for trading for the weak side of the market
- state : capital and nombre owned by the people in the group

finally, discussion of the price changing
it can be unsound to just write a price=f(price, lefting_nombre_of_buyingorselling_willing), but for a small simulation, it 
will be fine. let u know if i get new idea.

sum up : small project java and mysql, report of long list numbers, no documantation, no financal theory. but for a 4 day 
progamming test, nothing to say.

