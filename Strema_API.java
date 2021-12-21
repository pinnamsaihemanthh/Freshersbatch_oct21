1.

package information;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fruit {
	
	String name;
	int calories;
	int price;
	String color;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "FruitName: "+ name +" FruitCalories: "+calories+" FruitPrice: "+price+" FruitColor: "+color;
	}
	
	public static void main(String[] args) {
		
		List<Fruit> fs= Arrays.asList(
				new Fruit("Watermelon",84,140,"Green"),
				new Fruit("Apple",70,120,"Red"),
				new Fruit("Mango",100,70,"Yellow"),
				new Fruit("Banana",58,92,"Yellow"),
				new Fruit("Orange",82,150,"Orange")
			);
		
		System.out.println("Question No:1 -->");
		List<Fruit> ls= fs.stream()
				.filter(p ->p.getCalories()<100)
				.sorted(Comparator.comparingInt(Fruit::getCalories).reversed())
				.collect(Collectors.toList());
		System.out.println("Fruits with calories are less than 100 are:");
		ls.forEach(System.out::println);
		
		
		System.out.println("Question No:2 -->");
		List<Fruit> colorList=fs.stream()
				.sorted(Comparator.comparing(Fruit::getColor))
				.collect(Collectors.toList());
		System.out.println("Colorwise fruits is:");
		colorList.forEach(System.out::println);
		
		System.out.println("Question No:3 -->");
		fs.stream()
				.filter(p->p.getColor().contains("Red"))
				.sorted(Comparator.comparingInt(Fruit::getPrice))
				.forEach(System.out::println);
		
	}
	
	

}


2


package information;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class News {

	int newsId;
	String postedByUser;
	String commentByUser;
	String comment;

	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}

	public int getNewsId() {
		return newsId;
	}

	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	public String getPostedByUser() {
		return postedByUser;
	}

	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}

	public String getCommentByUser() {
		return commentByUser;
	}

	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public static void main(String[] args ) {

		List<News> list=Arrays.asList(
				new News(123, "MAXWELL", "Thanos", "Finance Minister Nirmala Sitharaman on Saturday said that the government, undeterred by the COVID-19 pandemic, has been pursuing reforms for achieving sustained long-term growth in a bid to make India one of the top economies of the world in the coming decades."),
				new News(234, "WARNER", "Loki", "Replying to debate on Budget 2021-22 in Lok Sabha, she said, the Prime Minister did not lose any opportunity to continue with the reforms and this Budget has set the pace for India to become self-reliant or Aatmanirbhar."),
				new News(345, "KANE", " Hulk", "he Budget for 2021-22, has provided the highest capex growth of 34.4 per cent by providing more money to railways, roads and defence."),
				new News(456, "ABD", "Loki", "he said her Budget for 2021-22, has provided the highest capex growth of 34.4 per cent by providing more money to railways, roads and defence.")
				);

		//Question 5
				int count=(int) list.stream()
						.filter(x-> x.comment.contains("Budget"))
						.count();
				System.out.println(count);
				
				System.out.println("=====================================================");

				
		//Question6
		 Optional<String> max = list.stream().map(x->x.commentByUser)
		 			.max((i,j)->i.compareTo(j));
		 System.out.println(max.get());
				
			 Optional<News> max1=list.stream()
			 .collect(Collectors.maxBy(Comparator.comparing(News::getCommentByUser)));
			 
		 System.out.println(max1.get());
				
			list.stream().map(x->x.commentByUser)
			.sorted()
			.forEach(System.out::println);
			
		//Question 7

	}

	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}


}


3


package information;

     import java.util.Arrays;
		import java.util.List;
		import java.util.stream.Stream;

		public class Trader {

			String name;
			String city;
			public Trader(String name, String city) {
				super();
				this.name = name;
				this.city = city;
			}

			public static void main(String[] args) {
				List<Trader> list=Arrays.asList(
						new Trader("WILLIAMSON", "Pune"),
						new Trader("WARNER", "Bangalore"),
						new Trader("STARC", "Pune"),
						new Trader("MAXWELL", "Delhi")
						);
				

				//Question 9
				list.stream().map(x-> x.city)
				.distinct()
				.forEach(System.out::println);


				System.out.println("==========================================");


				//Question 10
				list.stream().filter(x->x.city.contains("Pune"))
				.map(x->x.name)
				.sorted()
				.forEach(System.out::println);

			}

			@Override
			public String toString() {
				return "Trader [name=" + name + ", city=" + city + "]";
			}
                    }



4

package information;

import java.util.Arrays;
		import java.util.List;
		import java.util.Optional;
		import java.util.stream.Stream;

		public class Transactions {
			Trader trader;
			int year;
			int value;  

			public Transactions(Trader trader, int year, int value) {
				super();
				this.trader = trader;
				this.year = year;
				this.value = value;
			}

			public Trader getTrader() {
				return trader;
			}
			public void setTrader(Trader trader) {
				this.trader = trader;
			}
			public int getYear() {
				return year;
			}
			public void setYear(int year) {
				this.year = year;
			}
			public int getValue() {
				return value;
			}
			public void setValue(int value) {
				this.value = value;
			}
			@Override
			public String toString() {
				return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
			}
			public static void main(String[] args) {

				List<Transactions> list=Arrays.asList(
						new Transactions(new Trader("warner", "Pune"), 2011, 5000),
						new Transactions(new Trader("maxwell", "Bangalore"), 2012, 4000),
						new Transactions(new Trader("kane", "Pune"), 2011, 3000),
						new Transactions(new Trader("wade", "Delhi"), 2012, 2000)
						);

				//Question 8
				list.stream().filter(x-> x.year==2011)
				.map(x-> x.value)
				.sorted()
				.forEach(System.out::println);
				
				System.out.println("==========================================");
				
				//Question 11
				list.stream().map(x->x.trader.name)
				.sorted()
				.forEach(System.out::println);
				
				System.out.println("==========================================");
				
				//Question 12
				list.stream().filter(x->x.trader.city.contains("Indore"))
				.map(x->x.trader)
				.forEach(System.out::println);
				
				System.out.println("==========================================");
				
				//Question 13
				list.stream().filter(x->x.trader.city.contains("Delhi"))
				.map(x->x.value)
				.forEach(System.out::println);
				
				System.out.println("==========================================");

				//Question 14
				Optional<Integer> max = list.stream().map(x->x.value)
						.max((i,j)->i.compareTo(j));
				System.out.println(max);
				
				System.out.println("==========================================");

				//question 15
				Optional<Integer> min = list.stream().map(x->x.value)
						.min((i,j)->i.compareTo(j));

				System.out.println(min);
			}


		}