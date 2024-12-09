package Shoppingclothes;

import java.time.LocalTime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class StoreDetail {
	static int CstmId=1;
	
	static int availDress=12;
	static int availShirt=2;
	static int availPhant=2;
	static int availTraditional=2;
	static int availTop=2;
	static int availSkirt=2;
	static int availSaree=2;
	
	static List<Customer> PurcDetails=new ArrayList<Customer>();
	
	static void allocatedDress(Customer c) {
		switch(c.getPrefDress().toUpperCase()) {
		case "SHIRT":
			if(availShirt>0) {
				System.out.println("MRP: 620\n10% Discount: -62\nTotal: 558");
				System.out.println("Payment:");
				Scanner sc=new Scanner(System.in);
				int amt=sc.nextInt();
				if(amt==558) {
					c.setAllocatedDress("Shirt");
					availShirt--;
					System.out.println("Purchased Sucessfully\nOrderId: "+CstmId);
					c.setPaidAmt(amt);
					LocalTime ld= LocalTime.now();
					System.out.println(ld);
					c.setLd(LocalTime.now());
					c.setRntm(ld.plusSeconds(100));
				}else {
					System.out.println("Invalid Amount");
				}
			}else {
				System.out.println("Out of Stock");
			}
			break;
		case "PHANT":
			if(availPhant>0) {
				System.out.println("MRP :750\n10% Discount: -75\nTotal: 675");
				System.out.println("Payment:");
				Scanner sc=new Scanner(System.in);
				int amt=sc.nextInt();
				if(amt==675) {
					c.setAllocatedDress("Phant");
					availPhant--;
					System.out.println("Purchased Sucessfully\nOrderId: "+CstmId);
					c.setPaidAmt(amt);
					LocalTime ld= LocalTime.now();
					System.out.println(ld);
					c.setLd(LocalTime.now());
					c.setRntm(ld.plusSeconds(100));
				}else {
					System.out.println("Invalid Amount");
				}	
			}else {
				System.out.println("Out of Stock");
			}
			break;
		case "TRADITIONAL":
			if(availTraditional>0) {
				System.out.println("MRP: 1330\n10% Discount: -133\nTotal: 1197");
				System.out.println("Payment:");
				Scanner sc=new Scanner(System.in);
				int amt=sc.nextInt();
				if(amt==1197) {
					c.setAllocatedDress("TRADITIONAL");
					availTraditional--;
					System.out.println("Purchased Sucessfully\nOrderId: "+CstmId);
					c.setPaidAmt(amt);
					LocalTime ld= LocalTime.now();
					System.out.println(ld);
					c.setLd(LocalTime.now());
					c.setRntm(ld.plusSeconds(100));
				}else {
					System.out.println("Invalid Amount");
				}	
			}else {
				System.out.println("Out of Stock");
			}
			break;
		case "TOP":
			if(availTop>0) {
				System.out.println("MRP: 680\n10% Discount: -68\nTotal: 612");
				System.out.println("Payment:");
				Scanner sc=new Scanner(System.in);
				int amt=sc.nextInt();
				if(amt==612) {
					c.setAllocatedDress("Top");
					availTop--;
					System.out.println("Purchased Sucessfully\nOrderId: "+CstmId);
					c.setPaidAmt(amt);
					LocalTime ld= LocalTime.now();
					System.out.println(ld);
					c.setLd(LocalTime.now());
					c.setRntm(ld.plusSeconds(100));
				}else {
					System.out.println("Invalid Amount");
				}
			}else {
				System.out.println("Out of Stock");
			}
			break;
		case "SKIRT":
			if(availSkirt>0) {
				System.out.println("MRP: 720\n10% Discount: -72\nTotal: 648");
				System.out.println("Payment:");
				Scanner sc=new Scanner(System.in);
				int amt=sc.nextInt();
				if(amt==648) {
					c.setAllocatedDress("Skirt");
					availSkirt--;
					System.out.println("Purchased Sucessfully\nOrderId: "+CstmId);
					c.setPaidAmt(amt);
					LocalTime ld= LocalTime.now();
					System.out.println(ld);
					c.setLd(LocalTime.now());
					c.setRntm(ld.plusSeconds(100));
				}else {
					System.out.println("Invalid Amount");
				}
			}else {
				System.out.println("Out of Stock");
			}
			break;
		case "SAREE":
			if(availSaree>0) {
				System.out.println("MRP: 1240\n10% Discount: -122\nTotal: 1098");
				System.out.println("Payment:");
				Scanner sc=new Scanner(System.in);
				int amt=sc.nextInt();
				if(amt==1098) {
					c.setAllocatedDress("Saree");
					availSaree--;
					System.out.println("Purchased Sucessfully\nOrderId: "+CstmId);
					c.setPaidAmt(amt);
					LocalTime ld= LocalTime.now();
					System.out.println(ld);
					c.setLd(LocalTime.now());
					c.setRntm(ld.plusSeconds(100));
				}else {
					System.out.println("Invalid Amount");
				}
			}else {
				System.out.println("Out of Stock");
			}
			break;
		default:
				System.out.println("Invalid Selection");
				break;
		}
	}
	static void Order(Customer c) {
		if(availDress>0) {
			allocatedDress(c);
			availDress--;
			PurcDetails.add(c);
		}else {
			System.out.println("Out of Limit");
		}
	}
	
	static void viewDetail(int cId) {
		if(PurcDetails.isEmpty()) {
			System.out.println("Id Not found");
		}else {
			PurcDetails.forEach(e->{
				if(e.getCustomerId()==cId) {
					System.out.println("Name: "+e.getName());
					System.out.println("MobNo: "+e.getMobNo());
					System.out.println("Dress: "+e.getPrefDress());
					System.out.println("BillAmt: "+e.getPaidAmt());
					System.out.println("Time: "+e.getLd());
				}
			});
		}
	}
	
	static void removesld(String rem) {
		switch(rem.toUpperCase()) {
		case "SHIRT":
			availShirt++;
			break;
		case "PHANT":
			availPhant++;
			break;
		case "TRADITIONAL":
			availShirt++;
			break;
		case "TOP":
			availTop++;
			break;
		case "SKIRT":
			availSkirt++;
			break;
		case "SAREE":
			availSaree++;
			break;
		}
		
	}
	static void returnItem(int rId) {
		List<Customer> rtmIm=PurcDetails.stream().filter(e->e.getCustomerId()==rId)
				.collect(Collectors.toList());
		if(!rtmIm.isEmpty()) {
			Iterator<Customer>it=PurcDetails.iterator();
			while(it.hasNext()) {
				Customer c=it.next();
				if(c.getCustomerId()==rId) {
					if(LocalTime.now().isBefore(c.getRntm())) {
						it.remove();
						String rem=c.getAllocatedDress();
						removesld(rem);
						System.out.println(c.getAllocatedDress()+" Returned Sucessfully");
					}else {
						System.out.println("Time Out");
					}
					availDress++;
					}
				}
			}else {
				System.out.println("Id Not found");
			}
	}
	
	static void Stock(String st) {
		switch(st.toUpperCase()) {
		case "SHIRT":
			availShirt++;
			availDress++;
			System.out.println(st+" Stock Updated Sucessfully");
			break;
		case "PHANT":
			availPhant++;
			availDress++;
			System.out.println(st+" Stock Updated Sucessfully");
			break;
		case "TRADITIONAL":
			availTraditional++;
			availDress++;
			System.out.println(st+" Stock Updated Sucessfully");
			break;
		case "TOP":
			availTop++;
			availDress++;
			System.out.println(st+" Stock Updated Sucessfully");
			break;
		case "SKIRT":
			availSkirt++;
			availDress++;
			System.out.println(st+" Stock Updated Sucessfully");
			break;
		case "SAREE":
			availSaree++;
			availDress++;
			System.out.println(st+" Stock Updated Sucessfully");
			break;
		default:
				System.out.println("Invalid Product");
				break;
		}
	}
	static void User(String Userna) {
		String us="admin";
		if(Userna.equals(us)){
			System.out.println("Enter your Password");
			Scanner sc=new Scanner(System.in);
			String ps=sc.next();
			if(ps.equals(us)) {
				System.out.println("Choose the Product\n*Shirt\t*Phant\t*Traditional\t*Top\t*Skirt\t*Saree");
				String st=sc.next();
				Stock(st);
			}else {
				System.out.println("Incorrect Password");
			}
		}else {
			System.out.println("Invalid UserName");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String choice="Y";
		System.out.println("WELCOME TO SHOPPING");
		while(choice.equalsIgnoreCase("Y")) {
			System.out.println("Enter\t1.Purchase	2.Purchase Details   3.Return Product   4.Admin");
			int prefChoice=sc.nextInt();
			switch(prefChoice) {
			case 1:
				System.out.println("Enter your Name");
				String Name=sc.next().toUpperCase();
				System.out.println("Enter your Mob No");
				boolean valid=true;
				while(valid) {
				long MobNo=sc.nextLong();
				if(MobNo >100000000 && MobNo<9999999999L) {
					System.out.println("Select your Dress\n*Shirt\t*Phant\t*Traditional\t*Top\t*Skirt\t*Saree");
					String prefDress=sc.next().toUpperCase();
					Order(new Customer(CstmId,Name,MobNo,prefDress));
					CstmId++;
					valid=false;
				}
				else {
					System.out.println("please Enter Valid Mob NO");
					valid=true;
					}
				}
//				System.out.println("Select your Dress\n*Shirt\t*Phant\t*Traditional\t*Top\t*Skirt\t*Saree");
//				String prefDress=sc.next().toUpperCase();
//				Order(new Customer(CstmId,Name,MobNo,prefDress));
//				CstmId++;
				break;
			case 2:
				System.out.println("Enter your Order Id to View Details");
				int cId=sc.nextInt();
				viewDetail(cId);
				break;
			case 3:
				System.out.println("Enter your Order Id to Return Dress");
				int rId=sc.nextInt();
				returnItem(rId);
				break;
			case 4:
				System.out.println("Stock Update\nEnter your UserName:");
				String Userna=sc.next();
				User(Userna);
				break;
			default:
				System.out.println("Ivanlid Selection");
				break;
			}
			System.out.println("Do u want to Continue Shopping Y/N");
		    choice=sc.next();
		}
		System.out.println("Thanks For Purchasing Come Again ");
		sc.close();
	}
}